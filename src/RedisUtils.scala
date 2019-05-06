package com.wenbronk.sparkstreaming.scala.commons

import java.time.Duration

import io.lettuce.core.RedisURI
import io.lettuce.core.cluster.api.StatefulRedisClusterConnection
import io.lettuce.core.cluster.{ClusterClientOptions, ClusterTopologyRefreshOptions, RedisClusterClient}

import scala.collection.immutable


object RedisUtils {

  val ip = "localhost"
  val ports = Array(8888, 8889)

  def getRediceConnect: StatefulRedisClusterConnection[String, String] = {
    val uris: immutable.Seq[RedisURI] = ports.map(port => {
      RedisURI.builder().withHost(ip).withPort(port).build()
    }).toList
    import scala.collection.JavaConverters._
    val redisClusterClient = RedisClusterClient.create(uris.asJava)
    val topologyRefreshOptions = ClusterTopologyRefreshOptions.builder.enablePeriodicRefresh(Duration.ofMinutes(10)).enableAllAdaptiveRefreshTriggers.build
    redisClusterClient.setOptions(ClusterClientOptions.builder.autoReconnect(true).pingBeforeActivateConnection(true).topologyRefreshOptions(topologyRefreshOptions).build)
    redisClusterClient.connect()
  }

  def main(args: Array[String]): Unit = {
    getRediceConnect
  }


}