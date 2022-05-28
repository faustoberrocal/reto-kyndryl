FROM openjdk:11
VOLUME /tmp
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
HEALTHCHECK --start-period=30s --timeout=50s --retries=3 CMD curl -k -s --fail http://localhost:3081/  || exit 1
ENTRYPOINT ["java","-cp","app:app/lib/*","com.fausto.RetoKyndrylApplication"]
