package com.zuolizhu.Abstraction.ItemList;

public class SearchTree implements NodeList{

    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            // The tree is empty, newItem is the head of the tree
            this.root = newItem;
            return true;
        }

        // Otherwise, start comparing from the head of the tree
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if(comparison < 0) {
                // newItem is greater, move right if possible
                if(currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // There is no node to the right, so add at this point
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                // newItem is less, move left if possible
                if(currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    // There's no node to the left, add at this point
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                // Equal, return false
                System.out.println(newItem.getValue() + " is already added");
                return false;
            }
        }
        // Cannot add
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;
        while(currentItem != null) {
            int comparison = (currentItem.compareTo(item));
            if(comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if (comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                // Equal
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {
        // Remove item from the tree
        if(item.next() == null) {
            //No right tree, make parent point to left tree(might be null)
            if(parent.next() == item) {
                // Item is right child of its parent
                parent.setNext(item.previous());
            } else if (parent.previous() == item) {
                // Item is left child of its parent
                parent.setPrevious(item.previous());
            } else {
                // Delete the root
                this.root = item.previous();
            }
        } else if (item.previous() == null) {
            // No left tree, make parent point to right tree(might be null)
            if(parent.next() == item) {
                // Item is right child of its parent
                parent.setNext(item.next());
            } else if (parent.previous() == item) {
                // Item is left child of its parent
                parent.setPrevious(item.next());
            } else {
                // Delete the root
                this.root = item.next();
            }
        } else {
            // Neither left nor right are null, deletion is now a lot trickier!
            // From the right sub-tree, find the smallest value
            ListItem current = item.next();
            ListItem leftMostParent = item;
            while(current.previous() != null) {
                leftMostParent = current;
                current = current.previous();
            }
            // Now put the smallest value into node to be deleted
            item.setValue(current.getValue());
            // And delete the smallest
            if(leftMostParent == item) {
                // There was no leftmost node, current points to the smallest
                // node(the one that must be deleted)
                item.setNext(current.next());
            } else {
                // Set the smallest node's parent to point to
                // the smallest node's right child (might be null)
                leftMostParent.setPrevious(current.next());
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        // Recursive method
        if(root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
