## zuul 网关治理

两个特性

* 路由转发
* 请求过滤

### 路由转发 两种方式
* 传统方式 path + url
* 面向服务 path + service-id (eureka)

````
# 如：/api-a/hi 转发到对应服务的 /hi 路径
# 注意 serviceId 不可用 service-id 形式
zuul.routes.api-a.path=/api-a/**
zuul.routes.api-a.serviceId=EUREKA-CLIENT
zuul.routes.api-b.path=/api-b/**
zuul.routes..api-b.url=http://localhost:8092/api-a
````

demo中myfilter继承zuulfilter过滤器，请求时需携带token 参数 如`http://localhost:8095/api-a/hi?token=23`