#!/bin/sh
mvn clean package && docker build -t br.dev.hygino/EstatisticaWeb .
docker rm -f EstatisticaWeb || true && docker run -d -p 9080:9080 -p 9443:9443 --name EstatisticaWeb br.dev.hygino/EstatisticaWeb