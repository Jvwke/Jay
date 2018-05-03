files=`find ./test/ -iname "*.jay"`

cd target/classes
for file in $files;
do 
    echo '----------------------------'
    echo 'test file '$file
    java com.jay.Jay ../../$file
done

cd ../../