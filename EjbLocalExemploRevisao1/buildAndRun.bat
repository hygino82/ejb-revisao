@echo off
call mvn clean package
call docker build -t br.dev.hygino/EjbLocalExemploRevisao1 .
call docker rm -f EjbLocalExemploRevisao1
call docker run -d -p 9080:9080 -p 9443:9443 --name EjbLocalExemploRevisao1 br.dev.hygino/EjbLocalExemploRevisao1