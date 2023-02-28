FROM java:17-jdk
COPY ./target/demo-1-0.0.1-SNAPSHOT.jar /usr/app

WORKDIR /usr/app

RUN sh -c 'touch demo-1-0.0.1-SNAPSHOT.jar'

ENTRYPOINT [ "java","-jar","demo-1-0.0.1-SNAPSHOT" ]