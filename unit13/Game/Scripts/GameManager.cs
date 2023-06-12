using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using TMPro;
using UnityEngine.UI;

public class GameManager : MonoBehaviour
{
    public static GameManager Instance { get; private set;}

    public float initialGameSpeed = 5f;
    public float gameSpeedIncrease = 0.1f;
    public float gameSpeed { get; private set;}

    public TextMeshProUGUI gameOverText;
    public TextMeshProUGUI scoreText;
    public TextMeshProUGUI hiscoreText;
    public Button retryButton;

    private Player player;
    private Spawner spawner;

    private float score;

    private void Awake()
    {
        if (Instance != null) 
        {
        DestroyImmediate(gameObject);
        }
        else
        {
            Instance = this;
        }
    }
    
    private void OnDestroy()
    {
        if (Instance == this)
        {
            Instance = null;
        }
    }

    private void Start()
    {
        player = FindObjectOfType<Player>();
        spawner = FindObjectOfType<Spawner>();

        NewGame();
    }

    public void NewGame()
    {
        Obstacle[] obstacles = FindObjectsOfType<Obstacle>();

        foreach (var obstacle in obstacles) 
        {
            Destroy(obstacle.gameObject);//destroys all game objects in array obstacles
        }

        score = 0f;
        gameSpeed = initialGameSpeed;
        enabled = true;

        player.gameObject.SetActive(true); //reactivate objects
        spawner.gameObject.SetActive(true);
        gameOverText.gameObject.SetActive(false); //set off game over
        retryButton.gameObject.SetActive(false);
    }

    public void GameOver()
    {
        gameSpeed = 0f;
        enabled = false; //update will not get called

        player.gameObject.SetActive(false);
        spawner.gameObject.SetActive(false);
        gameOverText.gameObject.SetActive(true); //turn on game over text
        retryButton.gameObject.SetActive(true);

        UpdateHiscore();
    }

    private void Update()
    {
        gameSpeed += gameSpeedIncrease * Time.deltaTime;
        score += gameSpeed * Time.deltaTime; //score: distance traveled
        scoreText.text = Mathf.FloorToInt(score).ToString("D5"); //round numbers so it wont show decimal- D5 shows 0s in the
    }

    private void UpdateHiscore()
    {
        float hiscore = PlayerPrefs.GetFloat("hiscore", 0);

        if(score > hiscore)
        {
            hiscore = score;
            PlayerPrefs.SetFloat("hiscore", hiscore);
        }
        hiscoreText.text = Mathf.FloorToInt(hiscore).ToString("D5");
    }
}
