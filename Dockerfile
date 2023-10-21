from openjdk
COPY ./github-calculator/src/main/java/*.java /
RUN javac /Main.java /Calculator.java
ENTRYPOINT ["java", "Main"]