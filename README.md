# Jay Language

As a coder more than 6 years, I always hausted by the idea that I desire to make a programming language by myself. Though I have rich experience in using Java to make web application for enterprises, I know little about how to make a programing language, but I just could not stop that idea.

When I study the redis, I want to build a JRedis by myself, however I find that make a programming language and then use that language to build a JRedis may be more interesting! So I spent a week to read the <<The definitive ANTLR 4 Reference>>, and found that I could make a Lexer and Parser with the knowlege of the RegExpression is enough, it is easier than I thought. When I started to make a language, I found that 3 days is not enough. I searched in the Github, the ATSL(https://github.com/Aerodlyn/ATSL) was very great, the author have finished most of tasks already. I decided to base on that and do some changes and echancements to make my own language, I am familiar with the Java and VB grammar, so I want to mixed their grammar into my language. Many thanks to Aerodlyn, he did great job, but I failed to find which Licence he want to share his program...

# Guide
You can refer to the guide of ANTLR to install the antlr software(https://github.com/antlr/antlr4/blob/master/doc/getting-started.md). You can althougn use the gen.sh already in Jay project to install the antlr on Ubuntu.

If you change the J.g4 to match your own lanuage grammar, please use gen.sh to generate the language code runtime. When you change the source code, you can use all.sh to generate the language code and compile them and do testing. If you only want to do some test, use the run.sh is a short way.

# Examples
You can find examples at the test folder, all files with the subfix of '.jay'. The following is an example from test.jay
```
program Fib

function f(x) as int
  if x <= 1 then
    return x
  end if
  
  return f(x - 1) + f(x - 2) 
end function

write("The 6th term of the Fibonacci sequence is: ", f(6))
```
You can also use test.jay as a library, and call the function in test_imports.jay
```
program Imports

import "/home/j3z/git/Jay/Jay/test/test.jay"

write("")
write("import test.jay as a library")
write("The 2th term of the Fibonacci sequence is: ", f(2))
```
The import only scan the function from imported file, omit all global variables defined in imported file, please pay attention to avoid some mistakes, In case the function needs to visist the variable, you should redefine it in you current file.

# Available Features:
```
1.2018/05/01: Hello World! Support if, for, while, Array
2.2018/05/02: Support import, Call function before decalaration
3.2018/05/03: Support break, continue, fix circular import issue like A->B->A
```
