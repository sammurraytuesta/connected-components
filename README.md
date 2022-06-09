# ConnectedComponents
Takes an appropriately formatted txt file, translates an undirected, unweighted graph into an adjacency matrix, and outputs the number of connected components within the graph.

[![made-with-java](https://img.shields.io/badge/Made%20with-Java-1f425f.svg)](https://www.python.org/) [![java-version](https://img.shields.io/badge/Java%20SE-14-blue.svg)](https://shields.io/) [![data-structures](https://img.shields.io/badge/Data%20Structures-Non–Linear-blue.svg)](https://shields.io/) [![macOS](https://svgshare.com/i/ZjP.svg)](https://svgshare.com/i/ZjP.svg) [![GitHub](https://badgen.net/badge/icon/github?icon=github&label)](https://github.com/sammurraytuesta)

Sample input.txt:
```
5
0 1
3 4
1 2
```
Adjacency Matrix    
|   | 0 | 1 | 2 | 3 | 4 |
|---|---|---|---|---|---|
| 0 | 0 | 1 | 0 | 0 | 0 |
| 1 | 1 | 0 | 1 | 0 | 0 |
| 2 | 0 | 1 | 0 | 0 | 0 |
| 3 | 0 | 0 | 0 | 0 | 1 |
| 4 | 0 | 0 | 0 | 1 | 0 |

![graph](graph.drawio.svg)

```
$ javac Components.java
```

```
$ java Components input.txt
```

```
2
```
