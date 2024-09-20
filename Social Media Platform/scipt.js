let touchstartX = 0;
let touchendX = 0;

const handleSwipe = () => {
    if (touchendX < touchstartX) {
        window.location.href = 'profile.html';  // Swipe left, go to profile
    }
    if (touchendX > touchstartX) {
        window.location.href = 'index.html';  // Swipe right, go to home
    }
}

document.addEventListener('touchstart', (e) => {
    touchstartX = e.changedTouches[0].screenX;
});

document.addEventListener('touchend', (e) => {
    touchendX = e.changedTouches[0].screenX;
    handleSwipe();
});