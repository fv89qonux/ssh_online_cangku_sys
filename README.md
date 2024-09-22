## 本项目实现的最终作用是基于SSH在线仓库管理信息平台
## 分为1个角色
### 第1个角色为管理员角色，实现了如下功能：
 - 供应商管理
 - 商品入库管理
 - 商品出库管理
 - 商品库存管理
 - 商品管理
 - 商品类别管理
 - 管理员登录
## 数据库设计如下：
# 数据库设计文档

**数据库名：** ssh_online_cangku_sys

**文档版本：** 


| 表名                  | 说明       |
| :---: | :---: |
| [t_export](#t_export) |  |
| [t_goods](#t_goods) |  |
| [t_goodstype](#t_goodstype) |  |
| [t_import](#t_import) |  |
| [t_provider](#t_provider) |  |
| [t_stock](#t_stock) |  |
| [t_user](#t_user) | 用户表 |

**表名：** <a id="t_export">t_export</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 自增主键  |
|  2   | goodsId |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |
|  3   | expoPrice |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  4   | expoDate |   datetime   | 19 |   0    |    Y     |  N   |   NULL    |   |
|  5   | expoNum |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  6   | expoDesc |   varchar   | 1000 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="t_goods">t_goods</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 自增主键  |
|  2   | goodsId |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |
|  3   | goodsName |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  4   | proId |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |
|  5   | typeId |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |
|  6   | goodsDesc |   varchar   | 1000 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="t_goodstype">t_goodstype</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 自增主键  |
|  2   | typeName |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  3   | typeDesc |   varchar   | 1000 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="t_import">t_import</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 自增主键  |
|  2   | goodsId |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |
|  3   | impoPrice |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  4   | impoDate |   datetime   | 19 |   0    |    Y     |  N   |   NULL    |   |
|  5   | impoNum |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  6   | impoDesc |   varchar   | 1000 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="t_provider">t_provider</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 自增主键  |
|  2   | proId |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |
|  3   | proName |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  4   | linkman |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  5   | proPhone |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  6   | proDesc |   varchar   | 1000 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="t_stock">t_stock</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 自增主键  |
|  2   | goodsId |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |
|  3   | stockNum |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  4   | impoPrice |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  5   | expoPrice |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  6   | stockDesc |   varchar   | 1000 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="t_user">t_user</a>

**说明：** 用户表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 自增主键  |
|  2   | userName |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 用户名  |
|  3   | password |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 密码  |

