file:///C:/Users/s-svo/Desktop/Scala/lab1/src/main/scala/Main.scala
### scala.reflect.internal.FatalError: no context found for source-file:///C:/Users/s-svo/Desktop/Scala/lab1/src/main/scala/Main.scala,line-2,offset=73

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.12
Classpath:
<WORKSPACE>\.bloop\lab1\bloop-bsp-clients-classes\classes-Metals-0CbUgHuMRDCuDa0LoIvaSQ== [exists ], <HOME>\AppData\Local\bloop\cache\semanticdb\com.sourcegraph.semanticdb-javac.0.10.3\semanticdb-javac-0.10.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\modules\scala-parser-combinators_2.13\2.3.0\scala-parser-combinators_2.13-2.3.0.jar [exists ]
Options:
-Yrangepos -Xplugin-require:semanticdb


action parameters:
offset: 73
uri: file:///C:/Users/s-svo/Desktop/Scala/lab1/src/main/scala/Main.scala
text:
```scala
def findDuplicatesWithoutRepeats[T](list: List[T]): List[T] = {
  list.g@@roupBy(identity).filter(_._2.size > 1).keys.toList
  }

object Main extends App {
  val list = List(1, 2, 3, 2, 4, 1, 5, 2)
  val duplicates = findDuplicatesWithoutRepeats(list)
  println(duplicates) // Выведет: List(1, 2)
}
```



#### Error stacktrace:

```
scala.tools.nsc.interactive.CompilerControl.$anonfun$doLocateContext$1(CompilerControl.scala:100)
	scala.tools.nsc.interactive.CompilerControl.doLocateContext(CompilerControl.scala:100)
	scala.tools.nsc.interactive.CompilerControl.doLocateContext$(CompilerControl.scala:99)
	scala.tools.nsc.interactive.Global.doLocateContext(Global.scala:114)
	scala.meta.internal.pc.PcDefinitionProvider.definitionTypedTreeAt(PcDefinitionProvider.scala:155)
	scala.meta.internal.pc.PcDefinitionProvider.definition(PcDefinitionProvider.scala:68)
	scala.meta.internal.pc.PcDefinitionProvider.definition(PcDefinitionProvider.scala:16)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$definition$1(ScalaPresentationCompiler.scala:393)
```
#### Short summary: 

scala.reflect.internal.FatalError: no context found for source-file:///C:/Users/s-svo/Desktop/Scala/lab1/src/main/scala/Main.scala,line-2,offset=73