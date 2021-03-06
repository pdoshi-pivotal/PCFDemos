# Live Coding Scripts

This folder contains live coding scripts that can be used to demonstrate various aspects of Pivotal Cloud Foundry and Kubernetes. These scripts can also be used as instructions for developer workshops.

If you have any difficulties with Java on Windows, see this page for some tips: [Java on Windows Tips](JavaInstallOnWindows.md)

## Cloud Foundry

### Java/Spring Boot

Script | Description
--|--
[Java and JPA](JavaJPA.MD)| Simple JPA app. Uses H2 in-memory database locally, binds to an RDB in Cloud Foundry 
[Java and Redis](JavaRedis.MD) | Simple Redis app. Uses in-memory counter when run locally, binds to Redis in Cloud Foundry

### Kotlin/Spring Boot

Script | Description
--|--
[Kotlin and Redis](KotlinRedis.MD) | Simple Redis app. Uses in-memory counter when run locally, binds to Redis in Cloud Foundry

### C#/.Net Core / Steeltoe

Script | Description
--|--
[C# and Redis](DotNetCoreRedis.md) | Simple Redis app. Uses in-memory counter when run locally, binds to Redis in Cloud Foundry

## Kubernetes

Script | Description
--|--
[Springboot/Docker/Kubernetes](JavaDockerK8s.md) | Springboot running in Docker and Kubernetes 

### Knative

Script | Description
--|--
[Raw Knative with Minikube](KnativeMinikube.md) | Simple Knative install and serving with raw Knative / Kubectl commands
[Knative and Knctl with Minikube](KnativeAndKnctlMinikube.md) | Simple Knative install, serving, and build using Knctl
[Knative and riff with Minikube](KnativeAndRiffMinikube.md) | Simple Knative install, serving, and build using riff
