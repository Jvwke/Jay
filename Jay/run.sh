if [ ! -n "$1" ];then
    echo "Please specify the program file, e.g. 'run.sh /xxx_dir/xxxx.jay'"
    exit 1
fi

file=$1
if [ "${file:0:2}" == "./" ]; then
    path=$(dirname $(readlink -f $0)) # the current directory of run.sh
    file=$path${file:1} # replace './' with '/'
fi

if [ ! -f $file ];then
    echo "Program file is not found"
    exit 1
fi

cd target/classes
echo 'run file '$1
java com.jay.Jay $file

cd ../../

