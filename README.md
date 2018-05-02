# Jay Language

As a coder more than 6 years, I always hausted by the idea that I desire to make a programming language by myself. Though I known that I spend many years to study Logistics Engeering, my coding experience more about enterprise web application for  transportation service, I know little about how to make a programing language, but I just could not stop that idea.

So I spend a week to read the <<The definitive ANTLR 4 Reference>>, it helps me a lot, I find that I could make a Lexer and Parser that with little knowlege about the bottom knowlege of compiler, I only need to master the RegExpression, it is easier than I thought before. When I start to make a language, I find that 3 days is not enough, I searched in the Github, the ATSL(https://github.com/Aerodlyn/ATSL) is very great, the author have finished most of tasks already, so I want to base on that and do some changes to make my own laguage, I am more confortable with the Java or Lua grammar. Many thanks to Aerodlyn, he did great job, but I failed to find which Licence he want to share his program...

# Guide
You can refer to the guide of ANTLR to install the antlr software(https://github.com/antlr/antlr4/blob/master/doc/getting-started.md). You can althougn use the gen.sh already in Jay project to install the antlr on Ubuntu.

If you change the J.g4 to match your own lanuage grammar, please use gen.sh to generate the language code runtime. When you change the source code, you can use all.sh to generate the language code and compile them and do testing. If you only want to do some test, use the run.sh is a short way.

# Examples
You can examples at the test folder, all files with the subfix of '.jay'. The following is an example from test.jay
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
The import only scan the function from imported file, omit all global variables defined in imported file, please pay attention to avoid some mistakes.
