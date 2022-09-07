# seata1.5.1
10分钟带你整合seata1.5.1+openfeign+nacos2.1.0+springcloud
#本项目就是想简单试用一下seata1.5.1的AT模式
#项目整体流程==》就是通过访问tx_order模块插入数据库一条数据，然后通过openfeign调用tx_storage模块再插入一条数据
一、首先你需要去官网下载seata1.5.1的安装包 https://seata.io/zh-cn/
![image](https://user-images.githubusercontent.com/76611252/188831246-0f94ae3f-453a-478c-9cde-a097ed59a257.png)
