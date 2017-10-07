#!/bin/sh
#
#chkconfig: 2345 80 90
#description: mongodb
start() {
 /home/domea/mySoft/MongoDB/bin/mongod -f /home/domea/mySoft/MongoDB/mydata/config/mongodb.config
}
stop() {
 /home/domea/mySoft/MongoDB/bin/mongod -f /home/domea/mySoft/MongoDB/mydata/config/mongodb.config --shutdown
}
case "$1" in
  start)
 start
 ;;
  stop)
 stop
 ;;
  restart)
 stop
 start
 ;;
  *)
 echo $"Usage: $0 {start|stop|restart}"
 exit 1
esac