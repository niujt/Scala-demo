
表名:```bloomberg_commodity_daily_observation/bloomberg_commodity_daily_observation_bitemporal```

说明:```彭博商品每日观察详情表(_bitemporal代表双时序)```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_uuid|版本ID|uuid|仅在双时序表中存在|
|entity_state|实例状态|uuid|仅在双时序表中存在|
|valid_range|业务时间段|tstzrange|仅在双时序表中存在|
|system_range|系统时间段|tstzrange|仅在双时序表中存在|
|entity_id|实例ID|uuid||
|entity_doc|实例JSON|jsonb||
|instrument\_code|合约代码|character varying(50)|
|ticker|彭博代码|character varying(50)|
|observable\_id|商品观察属性|uuid|bloomberg\_commodity\_observable.entity\_id
|observation\_date|商品观察日期|date|
|values|商品价格组|jsonb|

父表:```无```

ID表:```bloomberg_commodity_daily_observation_key```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_id|版本ID|uuid||
|entity_doc|实例JSON|jsonb|无用|
|instrument\_code|合约代码|character varying(50)|
|observation\_date|商品观察日期|date|










---

表名:```bloomberg_commodity_observable/bloomberg_commodity_observable_bitemporal```

说明:```彭博商品观察属性(_bitemporal代表双时序)```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_uuid|版本ID|uuid|仅在双时序表中存在|
|entity_state|实例状态|uuid|仅在双时序表中存在|
|valid_range|业务时间段|tstzrange|仅在双时序表中存在|
|system_range|系统时间段|tstzrange|仅在双时序表中存在|
|entity_id|实例ID|uuid||
|entity_doc|实例JSON|jsonb||
|instrument\_code|合约代码|character varying(50)|
|ticker|彭博代码|character varying(50)|
|publisher|发布机构|character varying(50)|
|bloomberg\_instrument\_id|合约要素|uuid|bloomberg\_listed\_commodity\_instrument.entity\_id

父表:```无```

ID表:```bloomberg_commodity_observable_key```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_id|版本ID|uuid||
|entity_doc|实例JSON|jsonb|无用|
|instrument\_code|合约代码|character varying(50)|
|publisher|发布机构|character varying(50)|




---

表名:```bloomberg_listed_commodity_instrument/bloomberg_listed_commodity_instrument_bitemporal```

说明:```彭博场内商品合约要素表(_bitemporal代表双时序)```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_uuid|版本ID|uuid|仅在双时序表中存在|
|entity_state|实例状态|uuid|仅在双时序表中存在|
|valid_range|业务时间段|tstzrange|仅在双时序表中存在|
|system_range|系统时间段|tstzrange|仅在双时序表中存在|
|entity_id|实例ID|uuid||
|entity_doc|实例JSON|jsonb||
|instrument\_code|合约代码|character varying(50)|
|ticker|彭博代码|character varying(50)|
|long\_ticker|彭博长代码|character varying(50)|
|name|彭博名称|character varying(50)|
|status|合约状态|character varying(50)|
|product\_type|资产类型|character varying(50)|
|venue|交易所代码|character varying(50)|
|country|交易所所在国家|jsonb|
|currency\_unit|币种|character varying(50)|
|underlyer\_ticker|标的证券彭博代码|character varying(50)|
|underlyer\_market\_sector|标的市场分类|character varying(50)|
|multiplier|合约乘数|numeric(10, 4)|
|price\_precision|价格精度|numeric(10, 4)|
|price\_type|合约价格类型|character varying(50)|
|start\_date|发行日期|date|
|end\_date|最后交易日|date|
|delivery\_date|交割日期|date|
|delivery\_type|交割方式|character varying(50)|
|date\_adjustment\_type|日期调整方式|character varying(50)|
|unit|单位|character varying(50)|
|spec\_init\_margin|投机者最初保证金|numeric(10, 4)|
|spec\_sec\_margin|投机者追加保证金|numeric(10, 4)|
|hedge\_init\_margin|保值者最初保证金|numeric(10, 4)|
|hedge\_sec\_margin|保值者追加保证金|numeric(10, 4)|
|full\_exchange\_symbol|交易代码全称|character varying(50)|

父表:```无```

ID表:```bloomberg_listed_commodity_instrument_key```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_id|版本ID|uuid||
|entity_doc|实例JSON|jsonb|无用|
|instrument\_code|合约代码|character varying(50)|



















---

表名:```swap_curve_observation/swap_curve_observation_bitemporal```

说明:```互换曲线观察详情表(_bitemporal代表双时序)```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_uuid|版本ID|uuid|仅在双时序表中存在|
|entity_state|实例状态|uuid|仅在双时序表中存在|
|valid_range|业务时间段|tstzrange|仅在双时序表中存在|
|system_range|系统时间段|tstzrange|仅在双时序表中存在|
|entity_id|实例ID|uuid||
|entity_doc|实例JSON|jsonb||
|category|曲线种类|character varying(20)|
|publisher|曲线发布机构|character varying(50)|
|observation\_date|曲线日期|date|
|product|曲线品种|character varying(20)|
|tenor|曲线期限|character varying(5)|
|rate|曲线值|numeric(10, 4)|
|unit|曲线单位|character varying(20)|
|observable|曲线观察属性|jsonb|

父表:```无```

ID表:```swap_curve_observation_key```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_id|版本ID|uuid||
|entity_doc|实例JSON|jsonb|无用|
|category|曲线种类|character varying(20)|
|publisher|曲线发布机构|character varying(50)|
|observation\_date|曲线日期|date|
|product|曲线品种|character varying(20)|
|tenor|曲线期限|character varying(5)|










---

表名:```swap_curve_observation_set/swap_curve_observation_set_bitemporal```

说明:```互换曲线观察组表(_bitemporal代表双时序)```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_uuid|版本ID|uuid|仅在双时序表中存在|
|entity_state|实例状态|uuid|仅在双时序表中存在|
|valid_range|业务时间段|tstzrange|仅在双时序表中存在|
|system_range|系统时间段|tstzrange|仅在双时序表中存在|
|entity_id|实例ID|uuid||
|entity_doc|实例JSON|jsonb||
|curve\_name|曲线名称|character varying(50)|
|curve\_group|曲线类型|character varying(50)|
|curve\_starting\_date|曲线日期|date|
|observation\_ids|曲线详情|uuid[]|swap\_curve\_observation.entity\_id

父表:```无```

ID表:```swap_curve_observation_set_key```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_id|版本ID|uuid||
|entity_doc|实例JSON|jsonb|无用|
|curve\_name|曲线名称|character varying(50)|
|curve\_group|曲线类型|character varying(50)|
|curve\_starting\_date|曲线日期|date|










---

表名:```xquant_account/xquant_account_bitemporal```

说明:```二级账户基本表(_bitemporal代表双时序)```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_uuid|版本ID|uuid|仅在双时序表中存在|
|entity_state|实例状态|uuid|仅在双时序表中存在|
|valid_range|业务时间段|tstzrange|仅在双时序表中存在|
|system_range|系统时间段|tstzrange|仅在双时序表中存在|
|entity_id|实例ID|uuid||
|entity_doc|实例JSON|jsonb||
|account\_id|账户编号|character varying(30)|
|data\_source|数据来源|character varying(30)|
|sub\_table\_name|字表名称|character varying(30)|
|account\_name|账户名称|character varying(60)|
|open\_date|开户时间|date|
|close\_date|销户时间|date|
|status|账户状态|smallint|

父表:```无```

ID表:```xquant_account_key```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_id|版本ID|uuid||
|entity_doc|实例JSON|jsonb|无用|
|account\_id|账户编号|character varying(30)|
|data\_source|数据来源|character varying(30)|
|sub\_table\_name|字表名称|character varying(30)|




---

表名:```xquant_calendar_type/xquant_calendar_type_bitemporal```

说明:```日历类型表(_bitemporal代表双时序)```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_uuid|版本ID|uuid|仅在双时序表中存在|
|entity_state|实例状态|uuid|仅在双时序表中存在|
|valid_range|业务时间段|tstzrange|仅在双时序表中存在|
|system_range|系统时间段|tstzrange|仅在双时序表中存在|
|entity_id|实例ID|uuid||
|entity_doc|实例JSON|jsonb||
|calendar\_code|日历编码|character varying(50)|
|calendar\_name|日历名称|character varying(50)|

父表:```无```

ID表:```xquant_calendar_type_key```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_id|版本ID|uuid||
|entity_doc|实例JSON|jsonb|无用|
|calendar\_code|日历编码|character varying(50)|
|calendar\_name|日历名称|character varying(50)|




---

表名:```xquant_cash_account/xquant_cash_account_bitemporal```

说明:```二级资金账户表(_bitemporal代表双时序)```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_uuid|版本ID|uuid|仅在双时序表中存在|
|entity_state|实例状态|uuid|仅在双时序表中存在|
|valid_range|业务时间段|tstzrange|仅在双时序表中存在|
|system_range|系统时间段|tstzrange|仅在双时序表中存在|
|entity_id|实例ID|uuid||
|entity_doc|实例JSON|jsonb||
|remark|备注|character varying(200)|
|currency\_id|货币ID|uuid|xquant\_currency.entity\_id
|party\_id|交易对手ID|bigint|

父表:```xquant_account```

ID表:```xquant_cash_account_key```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_id|版本ID|uuid||
|entity_doc|实例JSON|jsonb|无用|




---

表名:```xquant_cash_ext_account/xquant_cash_ext_account_bitemporal```

说明:```一级资金账户表(_bitemporal代表双时序)```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_uuid|版本ID|uuid|仅在双时序表中存在|
|entity_state|实例状态|uuid|仅在双时序表中存在|
|valid_range|业务时间段|tstzrange|仅在双时序表中存在|
|system_range|系统时间段|tstzrange|仅在双时序表中存在|
|entity_id|实例ID|uuid||
|entity_doc|实例JSON|jsonb||
|password|账户密码|character varying(50)|
|is\_brokerage|是否经纪业务|smallint|
|custodian\_bank|托管银行|character varying(200)|
|password\_type|密码存储类型|smallint|

父表:```xquant_ext_account```

ID表:```xquant_cash_ext_account_key```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_id|版本ID|uuid||
|entity_doc|实例JSON|jsonb|无用|




---

表名:```xquant_company/xquant_company_bitemporal```

说明:```公司表(_bitemporal代表双时序)```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_uuid|版本ID|uuid|仅在双时序表中存在|
|entity_state|实例状态|uuid|仅在双时序表中存在|
|valid_range|业务时间段|tstzrange|仅在双时序表中存在|
|system_range|系统时间段|tstzrange|仅在双时序表中存在|
|entity_id|实例ID|uuid||
|entity_doc|实例JSON|jsonb||
|company\_id|公司编号|bigint|
|data\_source|数据来源|character varying(50)|
|company\_name|公司名称|character varying(1000)|
|unified\_social\_credit\_code|统一社会信用编码|character varying(100)|
|company\_type|公司类型|character varying(30)|
|company\_nature|企业性质|character varying(255)|
|company\_region|行政区域|character varying(50)|
|legal\_person|企业法人|character varying(200)|
|expiry\_date|有效日期|date|
|telephone|电话|character varying(20)|
|organizing\_institution\_bar\_code|组织机构编码|character varying(100)|
|pipe\_id|导入管道|numeric(38, 0)|
|import\_date\_time|导入日期|localDateTime|
|company\_industry\_id|公司行业ID|uuid|xquant\_company\_industry.entity\_id
|company\_rating\_id|公司评级ID|uuid|xquant\_company\_rating.entity\_id
|is\_city\_investment|是否城投|smallint|
|is\_list|是否上市|smallint|
|is\_issue\_bond|是否发债|smallint|

父表:```无```

ID表:```xquant_company_key```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_id|版本ID|uuid||
|entity_doc|实例JSON|jsonb|无用|
|company\_id|公司编号|bigint|
|data\_source|数据来源|character varying(50)|




---

表名:```xquant_company_industry/xquant_company_industry_bitemporal```

说明:```公司行业表(_bitemporal代表双时序)```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_uuid|版本ID|uuid|仅在双时序表中存在|
|entity_state|实例状态|uuid|仅在双时序表中存在|
|valid_range|业务时间段|tstzrange|仅在双时序表中存在|
|system_range|系统时间段|tstzrange|仅在双时序表中存在|
|entity_id|实例ID|uuid||
|entity_doc|实例JSON|jsonb||
|ci\_id|序号|bigint|
|data\_source|数据来源|character varying(50)|
|company\_code|公司编码|character varying(60)|
|company\_name|公司名称|character varying(1000)|
|industry\_source|行业来源|character varying(100)|
|industry\_code\_1|一级行业分类代码|character varying(50)|
|industry\_code\_2|二级行业分类代码|character varying(50)|
|industry\_code\_3|三级行业分类代码|character varying(50)|
|industry\_code\_4|四级行业分类代码|character varying(50)|
|begin\_date|起始日期|date|
|end\_date|结束日期|date|
|pipe\_id|导入管道|numeric(38, 0)|
|import\_date\_time|导入日期|localDateTime|

父表:```无```

ID表:```xquant_company_industry_key```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_id|版本ID|uuid||
|entity_doc|实例JSON|jsonb|无用|
|ci\_id|序号|bigint|
|data\_source|数据来源|character varying(50)|




---

表名:```xquant_company_rating/xquant_company_rating_bitemporal```

说明:```公司评级表(_bitemporal代表双时序)```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_uuid|版本ID|uuid|仅在双时序表中存在|
|entity_state|实例状态|uuid|仅在双时序表中存在|
|valid_range|业务时间段|tstzrange|仅在双时序表中存在|
|system_range|系统时间段|tstzrange|仅在双时序表中存在|
|entity_id|实例ID|uuid||
|entity_doc|实例JSON|jsonb||
|ci\_id|序号|bigint|
|data\_source|数据来源|character varying(50)|
|company\_code|公司编码|character varying(60)|
|company\_name|公司编码|character varying(1000)|
|rating\_type|评级类别|character(1)|
|rating\_grade|信用评级|character varying(10)|
|rating\_institution|评级机构|character varying(1000)|
|rating\_outlook|评级展望|character varying(50)|
|rating\_report\_address|评级报告地址|character varying(1000)|
|begin\_date|开始日期|date|
|end\_date|结束日期|date|
|pipe\_id|导入管道|numeric(38, 0)|
|import\_date\_time|导入日期|localDateTime|

父表:```无```

ID表:```xquant_company_rating_key```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_id|版本ID|uuid||
|entity_doc|实例JSON|jsonb|无用|
|ci\_id|序号|bigint|
|data\_source|数据来源|character varying(50)|




---

表名:```xquant_country/xquant_country_bitemporal```

说明:```国家表(_bitemporal代表双时序)```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_uuid|版本ID|uuid|仅在双时序表中存在|
|entity_state|实例状态|uuid|仅在双时序表中存在|
|valid_range|业务时间段|tstzrange|仅在双时序表中存在|
|system_range|系统时间段|tstzrange|仅在双时序表中存在|
|entity_id|实例ID|uuid||
|entity_doc|实例JSON|jsonb||
|country\_code|国家编码|character(2)|
|country\_name|国家名称|character varying(30)|
|domestic\_currency\_id|货币ID|uuid|xquant\_currency.entity\_id

父表:```无```

ID表:```xquant_country_key```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_id|版本ID|uuid||
|entity_doc|实例JSON|jsonb|无用|
|country\_code|国家编码|character(2)|
|country\_name|国家名称|character varying(30)|




---

表名:```xquant_currency/xquant_currency_bitemporal```

说明:```货币表(_bitemporal代表双时序)```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_uuid|版本ID|uuid|仅在双时序表中存在|
|entity_state|实例状态|uuid|仅在双时序表中存在|
|valid_range|业务时间段|tstzrange|仅在双时序表中存在|
|system_range|系统时间段|tstzrange|仅在双时序表中存在|
|entity_id|实例ID|uuid||
|entity_doc|实例JSON|jsonb||
|currency\_code|货币编码|character(3)|
|currency\_name|货币名称|character varying(30)|
|currency\_scale|货币精度|numeric(38, 0)|
|calendar\_type\_id|日历类型ID|uuid|xquant\_calendar\_type.entity\_id
|irc\_code||character varying(100)|

父表:```无```

ID表:```xquant_currency_key```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_id|版本ID|uuid||
|entity_doc|实例JSON|jsonb|无用|
|currency\_code|货币编码|character(3)|
|currency\_name|货币名称|character varying(30)|




---

表名:```xquant_ext_account/xquant_ext_account_bitemporal```

说明:```一级账户基本表(_bitemporal代表双时序)```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_uuid|版本ID|uuid|仅在双时序表中存在|
|entity_state|实例状态|uuid|仅在双时序表中存在|
|valid_range|业务时间段|tstzrange|仅在双时序表中存在|
|system_range|系统时间段|tstzrange|仅在双时序表中存在|
|entity_id|实例ID|uuid||
|entity_doc|实例JSON|jsonb||
|market\_type|市场类型|character varying(20)|
|exh\_acc|交易所账户|character varying(20)|
|acc\_type|账户类型|smallint|
|account\_ids|二级账户ID数组|uuid[]|xquant\_account.entity\_id

父表:```xquant_account```

ID表:```xquant_ext_account_key```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_id|版本ID|uuid||
|entity_doc|实例JSON|jsonb|无用|




---

表名:```xquant_instrument_of_value/xquant_instrument_of_value_bitemporal```

说明:```恒泰资产基础表(_bitemporal代表双时序)```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_uuid|版本ID|uuid|仅在双时序表中存在|
|entity_state|实例状态|uuid|仅在双时序表中存在|
|valid_range|业务时间段|tstzrange|仅在双时序表中存在|
|system_range|系统时间段|tstzrange|仅在双时序表中存在|
|entity_id|实例ID|uuid||
|entity_doc|实例JSON|jsonb||
|data\_source|数据来源|character varying(50)|

父表:```无```

ID表:```xquant_instrument_of_value_key```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_id|版本ID|uuid||
|entity_doc|实例JSON|jsonb|无用|
|data\_source|数据来源|character varying(50)|




---

表名:```xquant_party/xquant_party_bitemporal```

说明:```交易对手表(_bitemporal代表双时序)```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_uuid|版本ID|uuid|仅在双时序表中存在|
|entity_state|实例状态|uuid|仅在双时序表中存在|
|valid_range|业务时间段|tstzrange|仅在双时序表中存在|
|system_range|系统时间段|tstzrange|仅在双时序表中存在|
|entity_id|实例ID|uuid||
|entity_doc|实例JSON|jsonb||
|party\_id|交易对手编号|bigint|
|data\_source|数据来源|character varying(50)|
|party\_code|交易对手代码|character varying(20)|
|party\_name|交易对手名称|character varying(1000)|
|party\_short\_name|交易对手简称|character varying(100)|
|status|启用状态|smallint|
|party\_area|所在区域|character varying(50)|
|party\_source|新增类型|character varying(10)|自动、手动
|party\_institution\_type\_id|交易对手机构类型ID|uuid|xquant\_party\_institution\_type.entity\_id
|parent\_party\_id|上级所属机构ID|integer|
|actual\_control\_party\_id|交易对手实际控制人ID|integer|
|bank\_code|银行间会员代码|character varying(50)|
|xshe\_seat\_no|深交所席位号|character varying(50)|
|xshg\_seat\_no|上交所席位号|character varying(50)|
|xshg\_fi\_code|上交所固定收益平台代码|character varying(50)|
|xshg\_fi\_name|上交所固定收益平台名称|character varying(100)|
|sgex\_code|金交所账号|character varying(50)|
|zzd\_account\_id|中债登账户ID|uuid|xquant\_zzd\_account.entity\_id
|qss\_account\_id|清算所账户ID|uuid|xquant\_qss\_account.entity\_id
|wind\_party\_name|万得交易对手名称|character varying(200)|
|is\_agent|是否代理户|smallint|
|pay\_sys\_code|支付系统客户代码|character varying(50)|
|client\_manager|客户经理|character varying(250)|
|bank\_account\_info|银行账户|jsonb|
|link\_man\_info|联系人|jsonb|
|related\_party|交易关联方|smallint|
|issuer\_flag|是否发行人|smallint|
|issuer|发行人名称|character varying(1000)|
|is\_g1\_collection\_member|是否国债承销团成员|smallint|
|pledge\_right|质押券要求说明|character varying(500)|
|is\_pledge\_bond|可否质押上清所债券|smallint|
|is\_outright|可否进行买断式回购|smallint|
|special\_point|特殊时点说明|character varying(500)|
|counter\_party\_require|交易对手说明|character varying(500)|
|is\_common|是否常用|smallint|
|fx\_market\_maker\_type|外汇做市上类型|smallint|
|remark1|备注1|character varying(500)|
|remark2|备注2|character varying(500)|
|remark3|备注3|character varying(500)|
|remark4|备注4|character varying(500)|
|remark5|备注5|character varying(500)|
|remark6|备注6|character varying(500)|
|remark7|备注7|character varying(500)|
|remark8|备注8|character varying(500)|
|remark9|备注9|character varying(500)|
|remark10|备注10|character varying(500)|

父表:```无```

ID表:```xquant_party_key```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_id|版本ID|uuid||
|entity_doc|实例JSON|jsonb|无用|
|party\_id|交易对手编号|bigint|
|data\_source|数据来源|character varying(50)|




---

表名:```xquant_party_bank/xquant_party_bank_bitemporal```

说明:```交易对手银行账户信息表(_bitemporal代表双时序)```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_uuid|版本ID|uuid|仅在双时序表中存在|
|entity_state|实例状态|uuid|仅在双时序表中存在|
|valid_range|业务时间段|tstzrange|仅在双时序表中存在|
|system_range|系统时间段|tstzrange|仅在双时序表中存在|
|entity_id|实例ID|uuid||
|entity_doc|实例JSON|jsonb||
|party\_id|交易对手编号|bigint|
|data\_source|数据来源|character varying(50)|
|account\_code|银行账号|character varying(100)|
|account\_name|账号名称|character varying(100)|
|bank\_id|开户行行号|character varying(50)|
|bank\_name|开户行名称|character varying(200)|
|net\_bank\_code|电子联行行号|character varying(30)|
|currency\_id|货币ID|uuid|xquant\_currency.entity\_id
|status|启用状态|smallint|
|open\_purpose|开户用途|character varying(200)|
|open\_province|开户省份|character varying(200)|
|open\_city|开户城市|character varying(200)|
|open\_bank\_institution\_code|开户行机构号|character varying(100)|
|begin\_date|生效日期|date|
|end\_date|结束日期|date|
|query\_bank\_sequence|查询银行流水|smallint|
|query\_balance\_info|查询银行余额|smallint|
|cfets\_flag|外汇交易中心标志|smallint|
|clean\_bank\_code|清算行行号|character varying(100)|
|default\_flag|是否首选|smallint|
|match\_bank\_account\_code|下行原始银行账号|character varying(200)|
|zzd\_account\_code|中债登账户编号|character varying(50)|
|cash\_bank\_account\_name|资金系统开户行名称|character varying(200)|
|bank\_large\_pay\_number|大额支付行号|character varying(100)|

父表:```无```

ID表:```xquant_party_bank_key```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_id|版本ID|uuid||
|entity_doc|实例JSON|jsonb|无用|
|party\_id|交易对手编号|bigint|
|data\_source|数据来源|character varying(50)|
|account\_code|银行账号|character varying(100)|




---

表名:```xquant_party_host_account/xquant_party_host_account_bitemporal```

说明:```交易对手托管账户表(_bitemporal代表双时序)```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_uuid|版本ID|uuid|仅在双时序表中存在|
|entity_state|实例状态|uuid|仅在双时序表中存在|
|valid_range|业务时间段|tstzrange|仅在双时序表中存在|
|system_range|系统时间段|tstzrange|仅在双时序表中存在|
|entity_id|实例ID|uuid||
|entity_doc|实例JSON|jsonb||
|party\_id|交易对手编号|bigint|
|data\_source|数据来源|character varying(50)|
|host\_account\_type|托管账户类型|character varying(300)|
|host\_account\_code|托管账户编码|character varying(30)|
|host\_account\_name|托管账户名称|character varying(100)|
|is\_default|是否首选|smallint|

父表:```无```

ID表:```xquant_party_host_account_key```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_id|版本ID|uuid||
|entity_doc|实例JSON|jsonb|无用|
|party\_id|交易对手编号|bigint|
|data\_source|数据来源|character varying(50)|
|host\_account\_type|托管账户类型|character varying(300)|
|host\_account\_code|托管账户编码|character varying(30)|




---

表名:```xquant_party_institution_type/xquant_party_institution_type_bitemporal```

说明:```交易对手机构表(_bitemporal代表双时序)```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_uuid|版本ID|uuid|仅在双时序表中存在|
|entity_state|实例状态|uuid|仅在双时序表中存在|
|valid_range|业务时间段|tstzrange|仅在双时序表中存在|
|system_range|系统时间段|tstzrange|仅在双时序表中存在|
|entity_id|实例ID|uuid||
|entity_doc|实例JSON|jsonb||
|t\_code|交易对手机构编码|character varying(20)|
|data\_source|数据来源|character varying(50)|
|t\_name|交易对手机构编码|character varying(100)|

父表:```无```

ID表:```xquant_party_institution_type_key```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_id|版本ID|uuid||
|entity_doc|实例JSON|jsonb|无用|
|t\_code|交易对手机构编码|character varying(20)|
|data\_source|数据来源|character varying(50)|




---

表名:```xquant_party_kind/xquant_party_kind_bitemporal```

说明:```交易对手类别表(_bitemporal代表双时序)```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_uuid|版本ID|uuid|仅在双时序表中存在|
|entity_state|实例状态|uuid|仅在双时序表中存在|
|valid_range|业务时间段|tstzrange|仅在双时序表中存在|
|system_range|系统时间段|tstzrange|仅在双时序表中存在|
|entity_id|实例ID|uuid||
|entity_doc|实例JSON|jsonb||
|party\_id|交易对手编号|bigint|
|data\_source|数据来源|character varying(50)|
|account\_id|账户编号|character varying(20)|
|party\_kind\_id|交易对手类别名称|uuid|

父表:```无```

ID表:```xquant_party_kind_key```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_id|版本ID|uuid||
|entity_doc|实例JSON|jsonb|无用|
|party\_id|交易对手编号|bigint|
|data\_source|数据来源|character varying(50)|
|account\_id|账户编号|character varying(20)|




---

表名:```xquant_party_kind_type/xquant_party_kind_type_bitemporal```

说明:```交易对手类别表(_bitemporal代表双时序)```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_uuid|版本ID|uuid|仅在双时序表中存在|
|entity_state|实例状态|uuid|仅在双时序表中存在|
|valid_range|业务时间段|tstzrange|仅在双时序表中存在|
|system_range|系统时间段|tstzrange|仅在双时序表中存在|
|entity_id|实例ID|uuid||
|entity_doc|实例JSON|jsonb||
|party\_kind\_code|交易对手类别编码|character varying(20)|
|data\_source|数据来源|character varying(50)|
|party\_kind\_name|交易对手类别名称|character varying(100)|

父表:```无```

ID表:```xquant_party_kind_type_key```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_id|版本ID|uuid||
|entity_doc|实例JSON|jsonb|无用|
|party\_kind\_code|交易对手类别编码|character varying(20)|
|data\_source|数据来源|character varying(50)|




---

表名:```xquant_position/xquant_position_bitemporal```

说明:```恒泰持仓表(_bitemporal代表双时序)```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_uuid|版本ID|uuid|仅在双时序表中存在|
|entity_state|实例状态|uuid|仅在双时序表中存在|
|valid_range|业务时间段|tstzrange|仅在双时序表中存在|
|system_range|系统时间段|tstzrange|仅在双时序表中存在|
|entity_id|实例ID|uuid||
|entity_doc|实例JSON|jsonb||

父表:```position```

ID表:```xquant_position_key```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_id|版本ID|uuid||
|entity_doc|实例JSON|jsonb|无用|




---

表名:```xquant_qss_account/xquant_qss_account_bitemporal```

说明:```清算所账户表(_bitemporal代表双时序)```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_uuid|版本ID|uuid|仅在双时序表中存在|
|entity_state|实例状态|uuid|仅在双时序表中存在|
|valid_range|业务时间段|tstzrange|仅在双时序表中存在|
|system_range|系统时间段|tstzrange|仅在双时序表中存在|
|entity_id|实例ID|uuid||
|entity_doc|实例JSON|jsonb||
|account\_code|清算所账号|character varying(300)|
|account\_name|清算所账户名称|character varying(1000)|
|account\_class|清算所托管账户分类|character(1)|1：甲类，2：乙类，3：丙类

父表:```无```

ID表:```xquant_qss_account_key```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_id|版本ID|uuid||
|entity_doc|实例JSON|jsonb|无用|
|account\_code|清算所账号|character varying(300)|




---

表名:```xquant_security_account/xquant_security_account_bitemporal```

说明:```二级证券账户表(_bitemporal代表双时序)```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_uuid|版本ID|uuid|仅在双时序表中存在|
|entity_state|实例状态|uuid|仅在双时序表中存在|
|valid_range|业务时间段|tstzrange|仅在双时序表中存在|
|system_range|系统时间段|tstzrange|仅在双时序表中存在|
|entity_id|实例ID|uuid||
|entity_doc|实例JSON|jsonb||
|cash\_account\_id|二级资金账户ID|character varying(30)|xquant\_cash\_account.entity\_id
|owner|所有者|character varying(30)|
|trade\_kind|交易目的|character varying(30)|
|trade\_group|交易组|character varying(30)|
|trade\_group\_auto|是否自动创建交易组|smallint|
|is\_locked|是否锁定|boolean|
|lock\_status|锁定状态|smallint|
|ps1|证券账户属性1|character varying(30)|
|ps2|证券账户属性2|character varying(30)|
|ps3|证券账户属性3|character varying(30)|
|ps4|证券账户属性4|character varying(30)|
|ps5|证券账户属性5|character varying(30)|
|ps6|证券账户属性6|character varying(30)|
|ps7|证券账户属性7|character varying(30)|
|ps8|证券账户属性8|character varying(30)|
|account\_classification|账户分类科目|character varying(50)|
|account\_filter|账户过滤条件|character varying(2000)|
|pending\_deal\_trade\_group|组合编号|组合名称|character varying(50)|
|is\_reset\_cost\_profit|是否年终成本损益重置|smallint|
|proprietary\_flag|是否自营内部证券账户|smallint|

父表:```xquant_account```

ID表:```xquant_security_account_key```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_id|版本ID|uuid||
|entity_doc|实例JSON|jsonb|无用|




---

表名:```xquant_security_ext_account/xquant_security_ext_account_bitemporal```

说明:```一级证券账户表(_bitemporal代表双时序)```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_uuid|版本ID|uuid|仅在双时序表中存在|
|entity_state|实例状态|uuid|仅在双时序表中存在|
|valid_range|业务时间段|tstzrange|仅在双时序表中存在|
|system_range|系统时间段|tstzrange|仅在双时序表中存在|
|entity_id|实例ID|uuid||
|entity_doc|实例JSON|jsonb||
|cash\_ext\_account\_id|一级资金账户ID|character varying(30)|xquant\_cash\_ext\_account.entity\_id
|exh\_seat|交易所席位|character varying(20)|
|execution\_mode|执行模式|smallint|
|deal\_mode|成交方式|smallint|
|default\_flag|是否默认|smallint|
|host\_market|托管场所|character varying(20)|
|check\_exh\_data|是否流水对账|smallint|
|settle\_by|清算类型|smallint|
|fee\_record\_mode|记账方式|smallint|

父表:```xquant_ext_account```

ID表:```xquant_security_ext_account_key```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_id|版本ID|uuid||
|entity_doc|实例JSON|jsonb|无用|




---

表名:```xquant_trade/xquant_trade_bitemporal```

说明:```恒泰交易表(_bitemporal代表双时序)```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_uuid|版本ID|uuid|仅在双时序表中存在|
|entity_state|实例状态|uuid|仅在双时序表中存在|
|valid_range|业务时间段|tstzrange|仅在双时序表中存在|
|system_range|系统时间段|tstzrange|仅在双时序表中存在|
|entity_id|实例ID|uuid||
|entity_doc|实例JSON|jsonb||

父表:```trade```

ID表:```xquant_trade_key```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_id|版本ID|uuid||
|entity_doc|实例JSON|jsonb|无用|




---

表名:```xquant_trader/xquant_trader_bitemporal```

说明:```交易员表(_bitemporal代表双时序)```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_uuid|版本ID|uuid|仅在双时序表中存在|
|entity_state|实例状态|uuid|仅在双时序表中存在|
|valid_range|业务时间段|tstzrange|仅在双时序表中存在|
|system_range|系统时间段|tstzrange|仅在双时序表中存在|
|entity_id|实例ID|uuid||
|entity_doc|实例JSON|jsonb||
|data\_source|数据来源|character varying(50)|
|trader\_id|交易员ID|character varying(100)|
|trader\_name|交易员名称|character varying(200)|
|party\_id|交易对手ID|bigint|xquant\_party.entity\_id
|cell|手机|character varying(100)|
|tel|座机|character varying(100)|
|fax|传真|character varying(100)|
|email|电子邮箱|character varying(100)|
|physical\_address|通讯地址|character varying(200)|
|zip\_code|邮政编码|character varying(100)|
|position|职位|character varying(50)|
|status|账号状态|smallint|0：停用，1：启用
|msn|MSN|character varying(100)|
|im|即时通讯地址|character varying(200)|
|remark1|备注1|character varying(200)|
|remark2|备注2|character varying(200)|
|remark3|备注3|character varying(200)|
|remark4|备注4|character varying(200)|
|remark5|备注5|character varying(200)|
|is\_common|是否常用|smallint|0：不常用，1：常用
|is\_default|是否首选|smallint|0：非首选，1：首选
|is\_auto\_make\_market|是否自动做市|smallint|0：不是，1：是

父表:```无```

ID表:```xquant_trader_key```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_id|版本ID|uuid||
|entity_doc|实例JSON|jsonb|无用|
|data\_source|数据来源|character varying(50)|




---

表名:```xquant_zzd_account/xquant_zzd_account_bitemporal```

说明:```中证登账户表(_bitemporal代表双时序)```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_uuid|版本ID|uuid|仅在双时序表中存在|
|entity_state|实例状态|uuid|仅在双时序表中存在|
|valid_range|业务时间段|tstzrange|仅在双时序表中存在|
|system_range|系统时间段|tstzrange|仅在双时序表中存在|
|entity_id|实例ID|uuid||
|entity_doc|实例JSON|jsonb||
|account\_code|中债登账号|character varying(300)|
|account\_name|中债登账户名称|character varying(1000)|
|account\_class|中债登托管账户分类|character(1)|1：甲类，2：乙类，3：丙类

父表:```无```

ID表:```xquant_zzd_account_key```

|字段名|说明|类型|备注|
|---|---|---|---|
|entity_id|版本ID|uuid||
|entity_doc|实例JSON|jsonb|无用|
|account\_code|中债登账号|character varying(300)|




---
