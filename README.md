## Back-end con arquitectura de microservicios spring boot 2.5.8 desarrollado por Shyvox.
> Este proyecto es implementa design patterns para microservicios como 
> Service discovery, Edge server, Reactive, circuit breaker, central configuration entre otros
> con tecnologias como java 1.8, spring boot 2.5.8, docker, docker compose, swagger, webflux, cloud steam.
> Al finalizar el primer road, se trataran de sustituir ciertas tecnologias con otras de Kubernetes
> front-end con React, gastbyjs o Nextjs. "aun por definir"

[Acceder al backlog del proyecto](https://github.com/users/shyvox/projects/4)


### :gear: Instalación del proyecto
1. Clonar el repositorio en tu equipo, **mediante consola**:
```sh
> cd <folder path>
> git clone https://github.com/shyvox/acqui-microservices.git
```
2. Importar el proyecto mediante **IntelliJ IDEA**
   1. **Import Project**, y seleccionar la carpeta del proyecto.
   1. Marcar **Create Project from external model**, elegir **Gradle**.
   1. **Next** … **Finish**.   
3. Ejecución de un proyecto:
```sh
> ./gradlew build && docker-compose build
```
