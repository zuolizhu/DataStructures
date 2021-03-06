//Big O
//-Adding/removing head and tail
  // Constant Time - O(1)
//-Searching through LinkedList
  // Linear Time - O(n)
// Commonly use in Online gaming(Poker, board games, dominoes)

//Memory Management Benefits:
  //**Data doesnot have to be stored together



//LinkedList Constructor
function LinkedList() {
  this.head = null;
  this.tail = null;
}

//Node Constructor
function Node(value, next, prev) {
  this.value = value;
  this.next = next;
  this.prev = prev;
}

//AddToHead method
LinkedList.prototype.addToHead = function(value) {
  let newNode = new Node(value, this.head, null);
  //If there is a node
  if (this.head) {
    this.head.prev = newNode;
  }
  //If list is empty
  else {
    this.tail = newNode;
  }
  //Add new Node to the head
  this.head = newNode;
};

//AddToTail method
LinkedList.prototype.addToTail = function(value) {
  let newNode = new Node(value, null, this.tail);
  //If there is a node
  if (this.tail) {
    this.tail.next = newNode;
  }
  //If list is empty
  else {
    this.head = newNode;
  }
  //Add new Node to the tail
  this.tail = newNode;
};

//removeHead method
LinkedList.prototype.removeHead = function() {
  //If the list is empty
  if (!this.head) {
    return null;
  }
  //Save the value in the head node into a variable
  //So you can know which value you removed using
  //console.log(ll.removeHead())
  let val = this.head.value;
  //Rewired the pointer and remove the head node
  this.head = this.head.next;
  if (this.head) {
    this.head.prev = null;
  }
  else {
    this.tail = null;
  }
  return val;
}

//removeTail method
LinkedList.prototype.removeTail = function() {
  //If the list is empty
  if (!this.tail) {
    return null;
  }
  //Save the value in the head node into a variable
  //So you can know which value you removed using
  //console.log(ll.removeTail())
  let val = this.tail.value;
  //Rewired the pointer and remove the tail node
  this.tail = this.tail.prev;
  if (this.tail) {
    this.tail.next = null;
  }
  else {
    this.head = null;
  }
  return val;
}

//search method
LinkedList.prototype.search = function(searchValue) {
  let currentNode = this.head;
  //travel through list from node to node
  while (currentNode) {
    if (currentNode.value === searchValue) return currentNode.value;
    currentNode = currentNode.next;
  }
  return null;
}

LinkedList.prototype.indexOf = function(value) {
  let indexes = [];
  let currentIndex = 0;
  let currentNode = this.head;
  while (currentNode) {
    if (currentNode.value === value) {
      indexes.push(currentIndex);
    }
    currentNode = currentNode.next;
    currentIndex++;
  }
  return indexes;
}

//Test Block
let ll = new LinkedList();
ll.addToTail(5);
ll.addToTail(6);
ll.addToTail(8);
ll.addToTail(2);
ll.addToTail(7);
ll.addToTail(6);

console.log(ll.indexOf(6));
