# 📝 알고리즘 문제풀이 저장소

**코딩테스트 준비**와 **알고리즘 학습**을 위해 만든 문제 풀이 기록 공간
주요 학습 자료
- 📖 [Do it! 알고리즘 코딩테스트](https://book.naver.com/bookdb/book_detail.nhn?bid=22319552)  
- 💻 [백준 온라인 저지(BOJ)](https://www.acmicpc.net/)
- 🎓 인프런 강의 (자료구조 & 알고리즘 중심)

---

# 구간합 공식
**합배열공식**
 - S[i] = S[i-1] + A[i]

**구간합공식**
- S[j] - S[i-1]

**2차원 구간합배열 만드는 공식**
- D[i][j] = D[i][j-1] +D [i-1][j] - D[i-1][j-1] + A[i][j]

**특정 구간합 계산 공식**
- D[x1][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1]


# Deque
**앞 뒤로 넣고 뺄 수 있는 자료형**</br>
&nbsp; * 앞, 뒤 데이터 추가/삭제가 잦은 경우 유용함. </br>
&nbsp;&nbsp;&nbsp; ex) 슬라이드 윈도우에서 최솟값찾기 

- Deque<Node> deque = new LinkedList<>()
- Deque<Node> deque = new ArrayDeque<>()  : linkedList보다 성능상 우수
- deque.addFirst(), deque.removeFirst()  : 앞 데이터 관련
- deque.addLast(), deque.removeLast()  : 뒤데이터 관련
- deque.getFirst(), deque.getLast()  : 데이터 조회 관련

# Stack
**후입선출형, 깊이우선탐색(DFS)/백트래킹류의 코테에 효과적** </br>
push, peek, pop

# Queue
**선입선출형, 너비우선탐색(BFS)** </br>
뒤쪽 데이터 관련함수 : rear, add </br>
앞쪽 데이터 관련함수 : front, poll, peek

# PriorityQueue
**우선순위가 놓은 데이터가 먼저나옴**</br>
내림차순 정렬 : PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());</br>
사용자 지정 정렬 : </br>
enqueue()- queue에 새 요소를 삽입 </br>
dequeue() - queue에서 최대 우선 순위 요소를 삭제하고 그 값을 반환 </br>
peek() - queue에서 최대 우선순위 요소를 반환 </br>