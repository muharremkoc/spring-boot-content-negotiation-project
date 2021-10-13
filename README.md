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

``` java 
![image](https://user-images.githubusercontent.com/80245013/137121602-1d717609-086d-4c15-bf6e-b109b436ae2e.png)


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



![image](https://user-images.githubusercontent.com/80245013/137121679-95fcb36d-d42b-4d99-a3b1-5441b605fe65.png)



        <dependency>
            <groupId>com.fasterxml.jackson.dataformat</groupId>
            <artifactId>jackson-dataformat-xml</artifactId>
        </dependency>
       
       
       ![image](https://user-images.githubusercontent.com/80245013/137121733-21695bd3-8fa4-4670-a50d-648afc4d05bf.png)


 <dependency>
            <groupId>com.fasterxml.jackson.dataformat</groupId>
            <artifactId>jackson-dataformat-yaml</artifactId>
  </dependency>


```


## License
[Muharrem Koç](https://github.com/muharremkoc)
