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
  else {
    let currentNode = this.buckets[index];
    while (currentNode.next) {
      currentNode = currentNode.next;
    }
    currentNode.next = new HashNode(key, value);
  }
};



let myHT = new HashTable(30);

console.log(myHT.hash('ZuoliZhu'));