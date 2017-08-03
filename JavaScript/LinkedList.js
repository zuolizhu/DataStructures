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


//Test Block

let ll = new LinkedList();

// ll.addToHead(1);
// ll.addToHead(2);
// ll.addToHead(3);
// ll.addToTail(4);
// ll.addToTail(5);

ll.addToTail(1);
ll.addToTail(2);
ll.addToTail(3);

console.log(ll.tail.prev.prev);
