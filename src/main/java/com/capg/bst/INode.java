package com.capg.bst;

public interface INode<K> {
	K getKey();

	void setKey(K key);

	public void setLeft(INode left);

	public void setRight(INode right);

	public INode getLeft();

	public INode getRight();
}