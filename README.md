# spring-boot-content-negotiation-project

#### What is the Content Negotiation?

Content Negotiation,It is called the case of bringing requests to the Service in different formats. (For example: json, xml, yaml).

## Using Technologies

- Spring Boot Validation
- Lombok
- Mapperstruct
- MongoDB
- Spring Data Auditing
- MVC Config
- Spring Doc
- JacsonYML

## Important definitions


![Dependency1](https://user-images.githubusercontent.com/80245013/137122297-9f3dc8b2-2743-40f0-ad9a-a4551826b544.png)    ``` java 
                                                                                                                            <dependency>
                                                                                                                             <groupId>org.springdoc</groupId>
                                                                                                                             <artifactId>springdoc-openapi-ui</artifactId>
                                                                                                                             <version>${springdoc.version}</version>
                                                                                                                             <exclusions>
                                                                                                                                 <exclusion>
                                                                                                                                     <groupId>org.springframework</groupId>
                                                                                                                                     <artifactId>spring-webmvc</artifactId>
                                                                                                                                 </exclusion>
                                                                                                                             </exclusions>
                                                                                                                        </dependency>
                                                                                                                 ```



![Dependency2](https://user-images.githubusercontent.com/80245013/137122255-82859027-31d4-4a68-ab14-f98415abc1bd.png)



``` java 
        <dependency>
            <groupId>com.fasterxml.jackson.dataformat</groupId>
            <artifactId>jackson-dataformat-xml</artifactId>
        </dependency>
 ```
 
 
 ![Dependency3](https://user-images.githubusercontent.com/80245013/137122176-cf495a29-7aee-4460-a122-eca3d12cebf5.png)

       
``` java 
 <dependency>
            <groupId>com.fasterxml.jackson.dataformat</groupId>
            <artifactId>jackson-dataformat-yaml</artifactId>
  </dependency>
```
  

## License
[Muharrem Koç](https://github.com/muharremkoc)
