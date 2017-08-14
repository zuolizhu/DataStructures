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



let myHT = new HashTable(30);

myHT.insert('Zuoli', 'Zuolizhu5960x@gmail.com');
myHT.insert('Zuoli', 'zzh9@albany.edu');

console.log(myHT.buckets);
