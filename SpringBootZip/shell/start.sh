#!/bin/sh

#--------------------------------------------
# 功能：启动支付充值项目 own-charge.jar
# by lvchangrong 2017-03-20
#--------------------------------------------


#输入参数判断
if [ ! -n "$1" ] ;then
    echo "you have not input a script param! you can input such as:'sh start.sh prod' or 'sh start.sh test' or 'sh start.sh dev'"
    exit
fi


case $1 in
        "prod")
        ;;
        "dev")
        ;;
        "test")
        ;;
        *)
         echo "The file 'application-$1.properties' non-exist,you can start such as:'sh start.sh prod' or 'sh start.sh test or sh start.sh dev'"
        exit
        ;;
esac


echo "you will start server with properties file:'application-$1.properties'"
echo "please waiting ...."


#------------------变量设置--------------------------#
#项目jar
PROJECT_NAME="own-charge.jar"
#springboot applications文件名
APPLOCATION_PROPERTIES="application-$1.properties"
#start.sh脚本所在目录
SH_WORKDIR=$(dirname $0)
cd ${SH_WORKDIR}
SH_WORKDIR=`pwd`
#owncharge.jar路径
PROJECT_JAR_PATH="${SH_WORKDIR}/lib/${PROJECT_NAME}"
#conf路径
PROJECT_CONF_PATH="${SH_WORKDIR}/conf/${APPLOCATION_PROPERTIES}"
#启动log
START_APPEND_LOG="${SH_WORKDIR}/start_out.log"


#------------------启动--------------------------#

#stop server关闭进程
ps -ef|grep ${PROJECT_JAR_PATH}|grep -v grep|awk {'print $2'}|xargs kill -9

#启动项目
nohup nice java -jar -Dspring.config.location=${PROJECT_CONF_PATH}  ${PROJECT_JAR_PATH} > ${START_APPEND_LOG} 2>&1 &

#等待server启动时间
sleep 20

ps -fe|grep ${PROJECT_JAR_PATH} |grep -v grep

if [ $? -ne 0 ]
then
echo "owncharge  server start fail....."
exit 3
else
echo "owncharge  server start success....."
fi

