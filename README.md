# ConnectedComponents
Takes an appropriately formatted txt file, translates an undirected, unweighted graph into an adjacency matrix, and outputs the number of connected components within the graph.

[![made-with-java](https://img.shields.io/badge/Made%20with-Java-1f425f.svg)](https://www.python.org/) [![java-version](https://img.shields.io/badge/Java%20SE-14-blue.svg)](https://shields.io/) [![data-structures](https://img.shields.io/badge/Data%20Structures-Non–Linear-blue.svg)](https://shields.io/) [![macOS](https://svgshare.com/i/ZjP.svg)](https://svgshare.com/i/ZjP.svg) [![GitHub](https://badgen.net/badge/icon/github?icon=github&label)](https://github.com/sammurraytuesta)

## Program Specification
This program takes a single command line argument specifying a filename. The given file adheres to the format specified below. The program then reads the file to create an adjacency matrix representation of the graph and computes and prints the number of connected components in the graph.

### Input File Specification
Nodes in this undirected graph are numbered sequentially from 0..|V|. The first line of the file contains a single integer, specifying the number of |V|, and each remaining line in the file contains two integers indicating that an edge exists between the two nodes.

#### Sample Input
The sample input.txt is provided and formatted accordingly:
```
5
0 1
3 4
1 2
```
#### Adjacency Matrix    
|   | 0 | 1 | 2 | 3 | 4 |
|---|---|---|---|---|---|
| 0 | 0 | 1 | 0 | 0 | 0 |
| 1 | 1 | 0 | 1 | 0 | 0 |
| 2 | 0 | 1 | 0 | 0 | 0 |
| 3 | 0 | 0 | 0 | 0 | 1 |
| 4 | 0 | 0 | 0 | 1 | 0 | 

#### Graph Visualization
![graph](graph.drawio.svg)

#### Sample Invocation

```
$ javac Components.java
$ java Components input.txt
2
```
