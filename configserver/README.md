## Config Server

http请求地址和资源文件映射如下:

````
/{application}/{profile}[/{label}]
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties
````

如：`http://localhost:8096/config-client-prod.properties`
或`http://localhost:8096/config-client/prod/master`
返回：
````
eureka.client.serviceUrl.defaultZone: http://localhost:8001/eureka/
eureka.instance.hostname: localhost
eureka.instance.instance-id: config-server:localhost:8097
eureka.instance.prefer-ip-address: true
foo: foo version 3 : prod
info.appName: config-server
server.port: 8097
spring.application.name: config-client
spring.cloud.config.discovery.enabled: true
spring.cloud.config.discovery.service-id: config-server
spring.cloud.config.label: master
spring.cloud.config.profile: dev
spring.cloud.config.uri: http://localhost:8096/
````