//Hashtable constructor
function HashTable(size) {
  this.buckets = Array(size);
  this.numBuckets = this.buckets.length;
}

//Node constructor
function HashNode(key, value, next) {
  this.key = key;
  this.value = value;
  this.next = next || null;
}

//Hash method
HashTable.prototype.hash = function(key) {
  let total = 0;
  for (let i = 0; i < key.length; i++) {
    total += key.charCodeAt(i);
  }
  let bucket = total % this.numBuckets;
  return bucket;
};

//Insert method
HashTable.prototype.insert = function(key, value) {
  //Hash the key and figured out what bucket to put into null node in
  let index = this.hash(key);
  if (!this.buckets[index]) this.buckets[index] = new HashNode(key, value);
  //Check the first node in the bucket
  else if (this.buckets[index].key === key) {
    this.buckets[index].value = value;
  }
  else {
    let currentNode = this.buckets[index];
    while (currentNode.next) {
      if (currentNode.next.key === key) {
        currentNode.next.value = value;
        return;
      }
      currentNode = currentNode.next;
    }
    currentNode.next = new HashNode(key, value);
  }
};

//get method
HashTable.prototype.get = function(key) {
  let index = this.hash(key);
  if (!this.buckets[index]) return null;
  else {
    let currentNode = this.buckets[index];
    while (currentNode) {
      if (currentNode.key === key) return currentNode.value;
      //Travel through every node in this bucket
      currentNode = currentNode.next;
    }
    return null;
  }
};

//retrieveAll method
HashTable.prototype.retrieveAll = function() {
  let allNodes = [];
  for(let i = 0; i < this.numBuckets; i++) {
    let currentNode = this.buckets[i];
    while (currentNode) {
      allNodes.push(currentNode);
      currentNode = currentNode.next;
    }
  }
  return allNodes;
};







let myHT = new HashTable(30);

myHT.insert('Zuoli', 'Zuolizhu5960x@gmail.com');
myHT.insert('Joe', 'Joe@outlook.com');
myHT.insert('Kay', 'Ka@yahho.com');
myHT.insert('Mega', 'mg@hotmail.com');
myHT.insert('Omi', 'om@twitter.com');
myHT.insert('Biu', 'biu@bb.com');
console.log(myHT.retrieveAll());
