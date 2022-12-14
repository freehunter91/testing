FROM openjdk:11
ENV filename="testing-0.0.1-SNAPSHOT.jar"
RUN mkdir -p /apps/webapp
COPY target/${filename} /apps/webapp
WORKDIR /apps/webapp
EXPOSE 18000
CMD ["/bin/bash", "-c", "java -jar $filename"]

