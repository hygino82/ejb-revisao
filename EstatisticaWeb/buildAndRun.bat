@echo off
call mvn clean package
call docker build -t br.dev.hygino/EstatisticaWeb .
call docker rm -f EstatisticaWeb
call docker run -d -p 9080:9080 -p 9443:9443 --name EstatisticaWeb br.dev.hygino/EstatisticaWeb