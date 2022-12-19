# Stream Api

O que é uma stream em Java?

Stream permite processar dados de forma declarativa. Ainda mais, as streams
permite aproveitar as arquiteturas de núcleos múltiplos sem ter que programar
linhas de código multiprocesso.

A utilidade de utilizar é ter acesso a métodos bem úteis que facilitarão a rotina de
programação além de melhorar o nível do código.


![image](https://user-images.githubusercontent.com/106537496/201097308-fbbd5a29-8b24-4973-9860-dcc6ab847e48.png)

Fonte:  [Pdf](https://pdf.co/blog/java-streams)

## Métodos

**allMatch(Predicate<? super T> predicate)**: Retorna se todos os elementos deste fluxo correspondem ao predicado fornecido.

**anyMatch(Predicate<? super T> predicate)**: Retorna se algum elemento deste fluxo correspond ao predicado fornecido.

**builder()**: Retorna um construtor para um arquivo _Stream_.

**collect(collector<? super T,A,R> collector)**: Executa uma operação de redução mutável nos elementos desse fluxo usando um arquivo Collector.

**conca(Stram<? extends T> a, Stream<? extends T> b)**: Cria um fluxo concatenado cujo os elementos são todos os elementos do primeiro fluxo seguidos por 
todos os elementos dos segundo fluxo.

**count()**: Retorna a contagem de elementos neste fluxo.

**empty()**: Retorna um sequencial vazio _Stream_.

**filter(Predicate<? super T> predicate)**: Retorna um fluxo que consiste nos elementos desse fluxo que correspondem ao predicado fornecido.

**findAny()**: Retorna uma Optional descrição de algum elemento do fluxo ou um vazio Optional se o fluxo estiver vazio.

**findFirst()**: Retorna uma Optional descrição do primeiro elemento deste fluxo ou um vazio Optional se o fluxo estiver vazio.

**flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)**: Retorna um fluxo que consiste nos resultados da substituição de cada elemento
desse fluxo pelo conteúdo de um fluxo mapeado produzido pela aplicação da função de mapeamento fornecida a cada elemento.

**flatMapToDouble(Function<? super T,? extends DoubleStream> mapper)**: Retorna um _DoubleStream_ resultado da substituição de cada elemento desse fluxo pelo 
de um fluxo mapeado produzido pela aplicação da função de mapeamento fornecida a cada elemento.

**flatMapToInt(Function<? super T, ? extends IntStrem> mapper)**: Retorna um IntStream resultado da substituição de cada elemento desse fluxo pelo contéudo de 
um fluxo mapeado produzido pela aplicação da função de mapeamento fornecida a cada elemento.

**flatMapToLong(Function<? super T, ? extends LongStrem> mapper)**: Retorna um LongStrem de substituição de cada elemento desse fluxo pelo contéudo de um fluxo
mapeado produzido pela aplicação da função de mapeamento fornecida a cada elemento.

**forEach(Consumer<? super T> action)**: Executa uma ação para cada elemento deste fluxo.

**forEachOrdered(Consumer<? super T> action)**: Executa uma ação para cada elemento deste fluxo, na ordem de encontro do fluxo se o fluxo tiver uma ordem de encontro
definida.

 
 
                                                       






