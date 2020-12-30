# micro-service-level-3
For more way to check all type of external properties file. https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-external-config
# Actuator Configprops
You can see that your localhost actuator Configprops by clicking "http://localhost:8080/actuator/configprops". make sure before clicke overhere your application are running successfully. 
# Choosing Active Profile From Command Line Arguments
You can open Cmd and type command<br>
<b>For Test Environment</b>
<li>"java -jar spring-boot-config-0.0.1-SNAPSHOT.jar --spring.profiles.active=test"</li>
<b>For QA Environment</b>
<li>"java -jar spring-boot-config-0.0.1-SNAPSHOT.jar --spring.profiles.active=qa"</li>
<b>For prod Environment</b>
<li>"java -jar spring-boot-config-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod"</li>

