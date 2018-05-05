lang='J'

# download antlr4 jar
jar_path=/usr/local/lib/
jar=antlr-4.7.1-complete.jar

if [ ! -f $jar_path$jar ]; then
  echo "download antlr4 jar"
  sudo curl -o $jar_path$jar http://www.antlr.org/download/$jar
  echo '----------------------------'
fi

# set enviroment variable
cd ./src/main/java
echo "build $lang.g4"
CLASSPATH=".:$jar_path$jar:$CLASSPATH"
java -Xmx500M -cp "$jar_path$jar:$CLASSPATH" org.antlr.v4.Tool -visitor ${lang}.g4

if [ ! -d "com/jay/lang" ]; then
  mkdir -p com/jay/lang
fi

# copy resource files
echo '----------------------------'
files=('.interp' '.tokens' 'Lexer.interp' 'Lexer.tokens')
for file in ${files[@]};
do 
    echo 'copy file '$lang$file
    mv $lang$file com/jay/lang
done

# copy java file
echo '----------------------------'
files=('BaseListener.java' 'Listener.java' 'BaseVisitor.java' 'Visitor.java' 'Lexer.java' 'Parser.java')
for file in ${files[@]};
do 
    echo 'copy file '$lang$file
    touch tmp.java
    echo -e "package com.jay.lang;\n" > tmp.java
    cat $lang$file >> tmp.java
    sed -i "s/\t/    /g" tmp.java
    rm -rf com/jay/lang/$lang$file
    mv tmp.java com/jay/lang/$lang$file
    rm -rf ./$lang$file
done

cd ../../../
echo '----------------------------'
echo 'done'
