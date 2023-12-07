# AndroidAPS with autoISF
* For documentation about AndroidAPS without autoISF, check the wiki: https://androidaps.readthedocs.io
* Everyone who’s been looping with AndroidAPS needs to fill out the form after 3 days of looping  https://docs.google.com/forms/d/14KcMjlINPMJHVt28MDRupa4sz4DDIooI4SrW0P3HSN8/viewform?c=0&w=1

## What is autoISF?
AutoISF adds more power to the algorithm used in AndroidAPS by adjusting the insulin sensitivity based on different scenarios (e.g. high BG,
accelerating/decelerating BG, BG plateau). autoISF has many different settings to fine-tune these adjustments.
However, it is important to start with well-tested basal rate and settings for insulin sensitivity and carb ratios.

## Where to find documentation about autoISF
* Please visit ga-zelle’s repository [GitHub - ga-zelle/autoISF: extensions of AAPS for specific BG behaviours
  like stuck high or accelerating after meals with **documentation about autoISF**](https://github.com/ga-zelle/autoISF).
  The **Quick Guide (bzw. Kurzanleitung)** provides an overview of autoISF and its features

## Why do I get AutoISF here and not at ga-zelle's Repo?
* The majority of the AutoISF design and development effort was done by [ga-zelle](https://github.com/ga-zelle) with support from
  [swissalpine](https://github.com/swissalpine), [claudi](https://github.com/lutzlukesch),
  [BerNie](https://github.com/bherpichb), [mountrcg](https://github.com/mountrcg), 
  [Bjr](https://github.com/blaqone) and [myself](https://github.com/T-o-b-i-a-s).
* This repository here was created to provide a stable version of AndroidAPS with the current autoISF extensions
  already integrated to simplify the build process.
* This branch https://github.com/T-o-b-i-a-s/AndroidAPS/tree/3.2.0.2-ai3.0 uses
  AndroidAPS 3.2.0.2 (which is the `master` version on the official [Nightscout AndroidAPS]
  (https://github.com/nightscout/AndroidAPS)
  repo by the time when this text was written) as a base and adds autoISF 3.0 to it.

## What's new in AutoISF Version 3.0 when compared to 2.2.8.1
* Activity Monitor takes step counter from phone into consideration
* iob-Threshold allows to better limit/control the total amount of insulin on board
* New automation triggers and actions to allow for Automation rules specific for autoISF

## How to build this branch in Android Studio
1. Close any currently open projects in Android Studio
2. Create a new project by using the "Get from VCS" button to tell it to retrieve the source from a remote version control system
3. Use the url of this repository as a source (https://github.com/T-o-b-i-a-s/AndroidAPS.git)
4. Now wait until Android has completed any initialization activities. As always deny any requests to upgrade Gradle.
5. Android Studio now shows the name of the current branch in the lower right corner
  * Usually this will be `master`, which contains an out-dated version of AndroidAPS, do **not** use the `master` branch
  * If it is not already selected, switch to the branch you want to build by clicking on the branch name,
    choosing "show more" under "Remote branches" and look for the name of
    the branch with an "origin/" prefix: e.g. origin/3.2.0.2-ai3.0. Left-click that name and
    select "Checkout". The following screenshot shows how this will look like (a different branch was used here):
    ![Branch selection](Branch_selection_sample.png)
6. The system will now create a local branch with the same name as the remote branch and switch to that branch, which is indicated by the name of
   the branch being shown in the lower right corner
7. You can now build the APK with Build -> Generate signed Bundle / APK
8. In case of any error messages during the build, try to first run a "Clean build" by selecting
   Build -> Clean to remove any remnants from previous builds and then start the APK build again.
9. If you experience recurring problems with building the APK, as a last resort consider to 
   delete your current Android Studio completely, reinstall the most recent version and clone 
   this repo into a new directory (different than the one you have used before). 

General remark:
If you have been working with AndroidAPS 2.x before and this is the first time you build a 3.x version,
please first build and run the regular AndroidAPS 3.x version from
https://github.com/nightscout/AndroidAPS and double-check that this works fine.
Only then upgrade to the version including autoISF.

For questions or feedback, please contact us at https://de.loopercommunity.org/t/woher-wie-autoisf/
