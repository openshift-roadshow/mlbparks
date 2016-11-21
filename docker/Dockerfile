FROM wildfly
COPY ROOT.war /opt/app-root/src/target/ROOT.war
RUN $STI_SCRIPTS_PATH/assemble
CMD $STI_SCRIPTS_PATH/run
