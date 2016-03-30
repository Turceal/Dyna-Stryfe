using UnityEngine;
using System.Collections;

public class DrawCard : MonoBehaviour {

	public GameObject card= null;
	// Use this for initialization
	void Start () {
		Instantiate (card);
	}
	

}