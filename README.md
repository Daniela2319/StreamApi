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
 
                                                       📌 em andamento






