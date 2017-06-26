(ns writer-dice.core
  (:require [reagent.core :as r]
            [goog.dom]))

(def by-id goog.dom.getElement)

(def dice
  {:but [:div {}
         [:p {} [:strong {} "BUT"]
          " is the stubborn mentor."]
         [:p {} [:strong {} "BUT"]
          " adds an obstacle to overcome before your story can proceed."]
         [:p {} "Just remember, " [:strong {} "BUT"] " is still on your side."]
         [:p {} [:strong {} "BUT"] " wants your story to be the best it can be and has taken on the burden of being the tough-love friend who tests your limits."]
         [:p {} "When it’s clear things are getting too easy for your story, " [:strong {} "BUT"] " will step in the way."]
         [:p {} [:strong {} "BUT"] " gives you the opportunity to show why the reader should care about your story and its characters."]]
   :if [:div {}
        [:p {} [:strong {} "IF"] " is often seen with THEN."]
        [:p {} "However, " [:strong {} "IF"] " is the nervous planner."]
        [:p {} [:strong {} "IF"] " is far less impulsive than any of the other words."]
        [:p {} [:strong {} "IF"] " never jumps to the next beat blind."]
        [:p {} [:strong {} "IF"] " wants to know all the contingencies for the next beat and any prerequisites for the current beat."]
        [:p {} "Accommodating " [:strong {} "IF"] "’s worrisome nature can help set the stakes for your beats, showing the consequences of action or inaction."]]
   :or [:div {}
        [:p {} [:strong {} "OR"] " is the slippery rogue who works best in tight quarters."]
        [:p {} "If the story leads to a dead end, " [:strong {}  "OR"] " finds a path of escape in a storm drain or ventilation shaft."]
        [:p {} [:strong {} "OR"] " likes to think quickly, survey the scene at a glance and find new directions to take."]
        [:p {} "Even if the path isn’t what you think is best, " [:strong {}  "OR"] " will happily run down that path as far as possible, leaving you behind."]]
   :as [:div {}
        [:p {} [:strong {} "AS"] " is sibling to " [:strong {} "AND"] "."]
        [:p {} [:strong {} "AS"] " is the Ghost of Christmas Present."]
        [:p {} [:strong {} "AS"] " wants you to say more, too, but about what’s happening on the other side of town or on the other side of the world, depending on the scope of your story."]
        [:p {} [:strong {} "AS"] " wants you to create parallel plots that will converge on each other later in the story."]
        [:p {} [:strong {} "AS"] " can also help establish some context, showing how beats interact with each other in real time."]]
   :and [:div {}
         [:p {} [:strong {} "AND"] " is the patient Socratic inquisitor, but has no imagination."]
         [:p {} [:strong {} "AND"] " hits the pause button in your story so you have time to describe more of what’s happening in this scene."]
         [:p {} [:strong {} "AND"] " always wants you to say more. Always."]
         [:p {} [:strong {} "AND"] " has a voracious appetite for description, which is a blessing and a curse."]
         [:p {} [:strong {} "AND"] " lets you add depth to this beat without the pressure to rush on to the next one."]
         [:p {} [:strong {} "AND"] " can also mire you in inconsequential minutiae."]]})

(defn app-container []
  (let [face (rand-nth (keys dice))
        meaning (get dice face)]
    [:div {}
     [:h1 face]
     meaning]))

(r/render-component [app-container] (by-id "app"))
