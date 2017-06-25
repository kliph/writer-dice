(ns writer-dice.core
  (:require [reagent.core :as r]
            [goog.dom]))

(def by-id goog.dom.getElement)

(def dice
  {:but "BUT is the stubborn mentor. BUT adds an obstacle to overcome before your story can proceed. Just remember, BUT is still on your side. BUT wants your story to be the best it can be and has taken on the burden of being the tough-love friend who tests your limits. When it’s clear things are getting too easy for your story, BUT will step in the way. BUT gives you the opportunity to show why the reader should care about your story and its characters."
   :if "IF is often seen with THEN. However, IF is the nervous planner. IF is far less impulsive than any of the other words. IF never jumps to the next beat blind. IF wants to know all the contingencies for the next beat and any prerequisites for the current beat. Accommodating IF’s worrisome nature can help set the stakes for your beats, showing the consequences of action or inaction.
"
   :or "OR is the slippery rogue who works best in tight quarters. If the story leads to a dead end, OR finds a path of escape in a storm drain or ventilation shaft. OR likes to think quickly, survey the scene at a glance and find new directions to take. Even if the path isn’t what you think is best, OR will happily run down that path as far as possible, leaving you behind.
"
   :as "AS is sibling to AND. AS is the Ghost of Christmas Present. AS wants you to say more, too, but about what’s happening on the other side of town or on the other side of the world, depending on the scope of your story. AS wants you to create parallel plots that will converge on each other later in the story. AS can also help establish some context, showing how beats interact with each other in real time.
"
   :and "AND is the patient Socratic inquisitor, but has no imagination. AND hits the pause button in your story so you have time to describe more of what’s happening in this scene. AND always wants you to say more. Always. AND has a voracious appetite for description, which is a blessing and a curse. AND lets you add depth to this beat without the pressure to rush on to the next one. AND can also mire you in inconsequential minutiae."})

(defn app-container []
  (let [face (rand-nth (keys dice))
        meaning (get dice face)]
    [:div {}
     [:h1 face]
     [:p meaning]]))

(r/render-component [app-container] (by-id "app"))
