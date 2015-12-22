(ns polymer.google
  (:require [miraj.markup :refer [make-tag-fns]]))

(alter-meta! *ns* (fn [m] (assoc m :co-ns true)))

(def polymer-google-tags
  ["apis"
   "calendar"
   "castable-video"
   "chart"
   "feeds"
   "hangout-button"
   "map"
   "sheets"
   "signin"
   "streetview-pano"
   "url-shortener"
   "youtube"
   "youtube-upload"])

(make-tag-fns "google-" polymer-google-tags nil)
