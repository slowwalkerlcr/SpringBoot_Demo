#!/bin/sh

#--------------------------------------------
# 功能：停止支付充值项目 own-charge.jar
# by lvchangrong 2017-03-20
#--------------------------------------------
#------------------关闭服务--------------------------#

#输入参数判断
if [ ! -n "$1" ] ;then
    echo "please setup username,such as 'sh stop.sh username password port'"
    exit
fi
if [ ! -n "$2" ] ;then
    echo "please setup password,such as 'sh stop.sh username password port'"
    exit
fi
if [ ! -n "$3" ] ;then
    echo "please setup port,such as 'sh stop.sh username password port'"
    exit
fi

echo "you will stop server with [username:$1,password:$2,port:$3]"


#stop server
result=$(curl -u $1:$2 -X POST http://127.0.0.1:$3/shutdownpath)

echo $result


