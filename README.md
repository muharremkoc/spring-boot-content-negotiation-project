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

---

``` java 
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


---


``` java 
        <dependency>
            <groupId>com.fasterxml.jackson.dataformat</groupId>
            <artifactId>jackson-dataformat-xml</artifactId>
        </dependency>
 ```
 
 ---

       
``` java 
 <dependency>
            <groupId>com.fasterxml.jackson.dataformat</groupId>
            <artifactId>jackson-dataformat-yaml</artifactId>
  </dependency>
```
  

## License
[Muharrem Koç](https://github.com/muharremkoc)
