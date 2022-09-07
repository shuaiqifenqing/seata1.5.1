# seata1.5.1
10分钟带你整合seata1.5.1+openfeign+nacos2.1.0+springcloud
#本项目就是想简单试用一下seata1.5.1的AT模式
#项目整体流程==》就是通过访问tx_order模块插入数据库一条数据，然后通过openfeign调用tx_storage模块再插入一条数据
一、首先你需要去官网下载seata1.5.1的安装包 https://seata.io/zh-cn/
![image](https://user-images.githubusercontent.com/76611252/188831246-0f94ae3f-453a-478c-9cde-a097ed59a257.png)




在nacos中新建这三个配置，注意分组名

![image](https://user-images.githubusercontent.com/76611252/188832201-ab53e0b0-3791-47e4-8116-a12a675599ea.png)

![image](https://user-images.githubusercontent.com/76611252/188832048-1c9bb47a-8b47-4cbf-890f-e2fa04187993.png)

![image](https://user-images.githubusercontent.com/76611252/188832345-caee351e-501d-4c4e-a108-0cff85f87525.png)

![image](https://user-images.githubusercontent.com/76611252/188832798-4162e29e-73ef-47ab-a089-64f2357f96a4.png)




