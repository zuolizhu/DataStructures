package com.zuolizhu.Abstraction.ItemList;

public class ZZLinkedList implements NodeList{

    private ListItem root = null;

    public ZZLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null) {
            /** The list was empty, so this newItem becomes the head of the list
             */
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if(comparison < 0) {
                /** newItem is greater, move right if possible
                 */
                if(currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    /** There is no next item, insert the newItem at the end of the list
                     */
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if(comparison > 0) {
                // newItem is less, insert before
                if(currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                } else {
                    // The node with a previous is the root
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                // Equal
                System.out.println(newItem.getValue() + " is already added");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        while ((currentItem) != null) {
            int comparison = currentItem.compareTo(item);
            // Found item to delete
            if(comparison == 0) {
                // The item is the root
                if(currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else {
                //comparison > 0
                return false;
            }
        }
        // Reach the end of the list without finding anything
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        /**
         * Normal way to traverse
         */
        if(root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
