/*
Exercise solved at Codecadamy.com as part of the Web Developer Path Formation.
/*

const getUserChoice = userInput => {
  userInput = userInput.toLowerCase();
  
  //Certifies that the user input is a valid one.
  if (userInput === 'bomb'){
    return userInput;
  }
  else if(userInput === 'rock'){
    return userInput;
  }
  else if(userInput === 'paper'){
    return userInput;
  }
  else if(userInput === 'scissors'){
    return userInput;
  }
  else{
    return 'Invalid option';
  }
}

function getComputerChoice(){
  let computerChoice = Math.floor(Math.random() * 3);
  if(computerChoice === 0){
    return 'rock';
  }
  else if(computerChoice === 1){
    return 'paper';
  }
  else{
    return 'scissors';
  }
}

function determineWinner(userChoice, computerChoice){
  if(userChoice === 'bomb'){
    return 'No match is needed. The player won.';
    if(userChoice === computerChoice){
      return 'The game was a tie.';
    }
    else if(userChoice === 'rock'){
      if(computerChoice === 'paper'){
        return 'The computer won.';
      }
      else{
        return 'The user won.';
      }
    }
    else if(userChoice === 'paper'){
      if(computerChoice === 'scissors'){
        return 'The computer won.';
      }
      else{
        return 'The player won';
      }
    }
    else if(userChoice === 'scissors'){
      if(computerChoice === 'rock'){
        return 'The computer won.';
      }
      else{
        return 'The player won.';
      }
    }
    else{
      return 'An invalid option was selected. Play again.';
    }
  }
}

function playGame(){
  let userChoice = getUserChoice('bomb');
  let computerChoice = getComputerChoice();
  console.log('The user choice was: ' + userChoice + '.' + ' The computer choice was: ' + computerChoice + '.');
  console.log(determineWinner(userChoice, computerChoice));
}

playGame();
