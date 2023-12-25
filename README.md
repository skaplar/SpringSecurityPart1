# Working with multiple authentication managers in Spring Boot

This example is a follow-up to the article that I wrote. It shows how can spring security be configured to work with multiple authentication managers.

There are two main configuration classes ``InternalWebSecurityConfig`` and ``ExternalWebSecurityConfig``, one is used for internal purposes and and loaded from the ``application.properties`` and the other is used for exposing endpoints to the external parties whose configuration is loaded dynamically.

In order for the example to be fully functional I've left two ``TODO:`` that need to be done, and that is to enter proper ``User Pool Ids``, for AWS Cognito, which I am demoing in this application.

I've also provided two additional classes which are not actively used ``ExampleWebSecurityConfigUsingConverter`` and ``ExampleWebSecurityConfigUsingConverter`` in case someone needs more customization.

