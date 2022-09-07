# seata1.5.1
10分钟带你整合seata1.5.1+openfeign+nacos2.1.0+springcloud  
#本项目就是想简单试用一下seata1.5.1的AT模式  
#下面所提到的建表语句等信息都放在了tx_storage模块下content文件夹下  
#项目整体流程==》就是通过访问tx_order模块插入数据库一条数据，然后通过openfeign调用tx_storage模块再插入一条数据  
一、首先你需要去官网下载seata1.5.1的安装包 https://seata.io/zh-cn/  
![image](https://user-images.githubusercontent.com/76611252/188831246-0f94ae3f-453a-478c-9cde-a097ed59a257.png)




在nacos中新建这三个配置，配置格式选TEXT，注意分组名

![image](https://user-images.githubusercontent.com/76611252/188832201-ab53e0b0-3791-47e4-8116-a12a675599ea.png)

![image](https://user-images.githubusercontent.com/76611252/188832048-1c9bb47a-8b47-4cbf-890f-e2fa04187993.png)

![image](https://user-images.githubusercontent.com/76611252/188832345-caee351e-501d-4c4e-a108-0cff85f87525.png)

![image](https://user-images.githubusercontent.com/76611252/188832798-4162e29e-73ef-47ab-a089-64f2357f96a4.png)

seata的conf文件夹下的application.yml改成这样即可seataServer.properties和nacos中新建的名字对应
![image](https://user-images.githubusercontent.com/76611252/188833353-d5e931e4-872d-41b1-8e7d-0b9e84eda4c2.png)

数据库（mysql）建立seata库且需建立几张表  
![image](https://user-images.githubusercontent.com/76611252/188835231-c969de0c-b313-4477-afca-461e5a0a99ad.png)  
每一个业务库都需要建立一张undo_log表  
![image](https://user-images.githubusercontent.com/76611252/188835837-6d031a6d-b65c-460a-9611-5e982a778cd9.png)  
![image](https://user-images.githubusercontent.com/76611252/188835971-7ba560a3-6fb6-4662-bd46-2ba952b52c9b.png)


