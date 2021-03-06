/*!
 * long-press-event.js
 * Pure JavaScript long-press-event
 * https://github.com/john-doherty/long-press-event
 * @author John Doherty <www.johndoherty.info>
 * @license MIT
 */
!function (e, t) {
    "use strict";
    var n = null, a = "ontouchstart" in e || navigator.MaxTouchPoints > 0 || navigator.msMaxTouchPoints > 0,
        i = a ? "touchstart" : "mousedown", o = a ? "touchcancel" : "mouseout", m = a ? "touchend" : "mouseup",
        u = a ? "touchmove" : "mousemove";

    function r(t) {
        var a;
        (a = n) && (e.cancelAnimationFrame ? e.cancelAnimationFrame(a.value) : e.webkitCancelAnimationFrame ? e.webkitCancelAnimationFrame(a.value) : e.webkitCancelRequestAnimationFrame ? e.webkitCancelRequestAnimationFrame(a.value) : e.mozCancelRequestAnimationFrame ? e.mozCancelRequestAnimationFrame(a.value) : e.oCancelRequestAnimationFrame ? e.oCancelRequestAnimationFrame(a.value) : e.msCancelRequestAnimationFrame ? e.msCancelRequestAnimationFrame(a.value) : clearTimeout(a)), n = null
    }

    "function" != typeof e.CustomEvent && (e.CustomEvent = function (e, n) {
        n = n || {bubbles: !1, cancelable: !1, detail: void 0};
        var a = t.createEvent("CustomEvent");
        return a.initCustomEvent(e, n.bubbles, n.cancelable, n.detail), a
    }, e.CustomEvent.prototype = e.Event.prototype), e.requestAnimFrame = e.requestAnimationFrame || e.webkitRequestAnimationFrame || e.mozRequestAnimationFrame || e.oRequestAnimationFrame || e.msRequestAnimationFrame || function (t) {
        e.setTimeout(t, 1e3 / 60)
    }, t.addEventListener(o, r, !0), t.addEventListener(m, r, !0), t.addEventListener(u, r, !0), t.addEventListener("wheel", r, !0), t.addEventListener("scroll", r, !0), t.addEventListener(i, function (a) {
        r();
        var i = a.target, o = parseInt(i.getAttribute("data-long-press-delay") || "1500", 10);
        n = function (t, n) {
            if (!(e.requestAnimationFrame || e.webkitRequestAnimationFrame || e.mozRequestAnimationFrame && e.mozCancelRequestAnimationFrame || e.oRequestAnimationFrame || e.msRequestAnimationFrame)) return e.setTimeout(t, n);
            var a = (new Date).getTime(), i = {}, o = function () {
                (new Date).getTime() - a >= n ? t.call() : i.value = requestAnimFrame(o)
            };
            return i.value = requestAnimFrame(o), i
        }(function () {
            r(), this.dispatchEvent(new CustomEvent("long-press", {
                bubbles: !0,
                cancelable: !0
            })) && t.addEventListener(m, function e(n) {
                t.removeEventListener(m, e, !0), function (e) {
                    e.stopImmediatePropagation(), e.preventDefault(), e.stopPropagation()
                }(n)
            }, !0)
        }.bind(i), o)
    }, !0)
}(window, document);